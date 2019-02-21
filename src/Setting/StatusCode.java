package Setting;

public class StatusCode
{
    private static String[] CodeId =
            {
                    "Success",                      // 0
                    "Account verification error",   // 1
                    "Token error",                  // 2
                    "id not exist",                 // 3
                    "data not exist",               // 4
                    "serialnumber not exist or already register", // 5
                    "Data incorrectly",             // 6
                    "category error",               // 7
                    "Auth error",                   // 8
                    "status error",                 // 9
                    "name already exist",           // 10
                    "Parameter error",              // 11
                    "account already exist",        // 12
                    "Database error",               // 13
                    "Server error",                 // 14
                    "cookies error",                // 15
                    "I/O error",                    // 16
                    "Data exists",                  // 17
                    "number already exist",         // 18
                    "workid error",                 // 19
                    "number error",                 // 20
                    "State conflict",               // 21
                    "Auditing error",               // 22
                    "InterruptedException",         // 23
                    "order already exist",          // 24
                    "machine number error",         // 25
                    "order number error",           // 26
                    "order limit 1",                // 27
                    "data exist can't delete",      // 28
                    "name already exist",           // 29
                    "Order in progress",            // 30
                    "File Update Error",            // 31
                    "Mail Token error",             // 32
                    "not have the authority",       // 33
                    "Mail already exist",           // 34
            };

    public static String getCodeId(int num)
    {
        return CodeId[num];
    }
}
