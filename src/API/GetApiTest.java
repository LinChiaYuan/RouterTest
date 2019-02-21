/**
 *
 *  author  :   Chia Yuan Lin (林家源)
 *
 *  email   :   lo919201@gmail.com
 *
 * **/
package API;

import Response.Res_G001;
import Response.Res_Msg;
import Setting.StatusCode;
import data.data_G001;
import org.restlet.ext.json.JsonRepresentation;
import org.restlet.representation.Representation;
import org.restlet.resource.ServerResource;

import java.util.ArrayList;
import java.util.List;

public class GetApiTest extends ServerResource
{

    public Representation get()
    {
        String workid = getAttribute("workid");
        String Msg =  getAttribute("msg");
        JsonRepresentation json;

        switch (workid)
        {
            case "G001":
                Res_G001 res_g001 = new Res_G001(workid, "00",StatusCode.getCodeId(0));

                List<data_G001> list = new ArrayList<data_G001>();
                data_G001 data_g001 = new data_G001();
                data_g001.setGetMsg(Msg);
                list.add(data_g001);
                res_g001.setData(list);

                json = new JsonRepresentation(res_g001);
                break;
            default:
                Res_Msg res_msg = new Res_Msg(workid, "19",StatusCode.getCodeId(19));
                json = new JsonRepresentation(res_msg);
                break;
        }
        return json;
    }

}
