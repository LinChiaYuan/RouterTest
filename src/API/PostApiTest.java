/**
 *
 *  author  :   Chia Yuan Lin (林家源)
 *
 *  email   :   lo919201@gmail.com
 *
 * **/
package API;

import Response.Res_Msg;
import Response.Res_P001;
import Setting.StatusCode;
import data.data_P001;
import org.json.JSONException;
import org.json.JSONObject;
import org.restlet.ext.json.JsonRepresentation;
import org.restlet.representation.Representation;
import org.restlet.resource.ServerResource;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class PostApiTest extends ServerResource
{

    public Representation post(Representation data)
    {
        JsonRepresentation json;
        String workid = getAttribute("workid");

        try
        {
            JsonRepresentation jsonRaw = new JsonRepresentation(data);
            JSONObject jsonObj = jsonRaw.getJsonObject();
            String Msg = jsonObj.getString("msg");


            switch (workid)
            {
                case "P001":
                    Res_P001 res_p001 = new Res_P001(workid, "00", StatusCode.getCodeId(0));

                    List<data_P001> list = new ArrayList<data_P001>();
                    data_P001 data_p001 = new data_P001();
                    data_p001.setGetMsg(Msg);
                    list.add(data_p001);
                    res_p001.setData(list);

                    json = new JsonRepresentation(res_p001);
                    break;
                default:
                    Res_Msg res_msg = new Res_Msg(workid, "19",StatusCode.getCodeId(19));
                    json = new JsonRepresentation(res_msg);
                    break;
            }
            return json;
        }
        catch (IOException e)
        {
            Res_Msg res_msg = new Res_Msg(workid, "16",StatusCode.getCodeId(16));
            json = new JsonRepresentation(res_msg);
            return json;
        }
        catch (JSONException e)
        {
            Res_Msg res_msg = new Res_Msg(workid, "11",StatusCode.getCodeId(11));
            json = new JsonRepresentation(res_msg);
            return json;
        }
    }
}
