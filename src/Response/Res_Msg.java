/**
 *
 *  author  :   Chia Yuan Lin (林家源)
 *
 *  email   :   lo919201@gmail.com
 *
 * **/
package Response;

import java.io.Serializable;

public class Res_Msg implements Serializable
{
    private String workID;
    private String status;
    private String message;

    public Res_Msg(String workID, String status, String message)
    {
        this.workID = workID;
        this.status = status;
        this.message = message;
    }

    public String getWorkID() {
        return workID;
    }

    public void setWorkID(String workID) {
        this.workID = workID;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
