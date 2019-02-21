/**
 *
 *  author  :   Chia Yuan Lin (林家源)
 *
 *  email   :   lo919201@gmail.com
 *
 * **/
package Response;

import data.data_G001;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class Res_G001 implements Serializable
{
    private String workID;
    private String status;
    private String message;
    private List<data_G001> data;

    public Res_G001(String workID, String status,String message) {
        this.workID = workID;
        this.status = status;
        this.message = message;
        this.data = new ArrayList<data_G001>();
    }

    public String getWorkID() {
        return workID;
    }
    public String getStatus() {
        return status;
    }
    public String getMessage() {
        return message;
    }
    public List<data_G001> getData() {
        return data;
    }
    public void setWorkID(String workID) {
        this.workID = workID;
    }
    public void setStatus(String status) {
        this.status = status;
    }
    public void setMessage(String message) {
        this.message = message;
    }
    public void setData(List<data_G001> data) {
        this.data = data;
    }
}
