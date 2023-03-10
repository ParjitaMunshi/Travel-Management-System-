/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ui.carRentalUIPanels;

/**
 *
 * @author slenk
 */
public class RentDisplayUILabels {
    public static String getHTMLBusScheduleCode(int busId, String departingDate, String departureTimestamp, 
            String arrivalTimestamp, String departingCity, String arrivalCity, String busCompanyName) {
        
        String formattedDate = getFormattedDate(departingDate);
                
        return "<html>\n" +
                "  <head>\n" +
                "    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\" />\n" +
                "    <link\n" +
                "      rel=\"stylesheet\"\n" +
                "      href=\"https://fonts.googleapis.com/css2?family=Material+Symbols+Outlined:opsz,wght,FILL,GRAD@48,400,0,0\"\n" +
                "    />\n" +
                "    <style>\n" +
                "      * {\n" +
                "        box-sizing: border-box;\n" +
                "      }\n" +
                "\n" +
                "      h2,\n" +
                "      h3,\n" +
                "      h4,\n" +
                "      h5 {\n" +
                "        margin: 0;\n" +
                "      }\n" +
                "\n" +
                "      .row {\n" +
                "        width: 321px;\n" +
                "        height: 100px;\n" +
                "        background-color: #000;\n" +
                "        color: #ffffff;\n" +
                "        padding-left: 10px;\n" +
                "      }\n" +
                "\n" +
                "      /* Create three equal columns that floats next to each other */\n" +
                "      .column {\n" +
                "        float: left;\n" +
                "        width: 33.33%;\n" +
                "        padding: 10px;\n" +
                "        height: 150px; /* Should be removed. Only for demonstration */\n" +
                "      }\n" +
                "\n" +
                "      .ft-column {\n" +
                "        float: left;\n" +
                "        width: 33.33%;\n" +
                "        padding: 7px 0;\n" +
                "        text-align: center;\n" +
                "        height: 30px;\n" +
                "      }\n" +
                "\n" +
                "      .material-symbols-outlined {\n" +
                "        font-variation-settings: \"FILL\" 0, \"wght\" 400, \"GRAD\" 0, \"opsz\" 48;\n" +
                "      }\n" +
                "\n" +
                "      .flight-icon {\n" +
                "        transform: rotate(90deg);\n" +
                "      }\n" +
                "\n" +
                "      .flight-details {\n" +
                "        margin-top: 10px;\n" +
                "      }\n" +
                "\n" +
                "      .flight-type {\n" +
                "        margin-top: 15px;\n" +
                "        display: flex;\n" +
                "        align-items: center;\n" +
                "      }\n" +
                "    </style>\n" +
                "  </head>\n" +
                "  <body>\n" +
                "    <div class=\"row\">\n" +
                "      <h2>Time</h2>\n" +
                "      <div class=\"flight-details\">\n" +
                "        <h3>" + formattedDate + "</h3>\n" +
                "        <h4>"+ departingCity + " | " + departureTimestamp + "  ---  " + 
                "<span>???????</span>" + "  ---  "
                + arrivalCity + " | " + arrivalTimestamp +"</h4>\n" +
                "        <h4 class=\"flight-type\">\n"
                + "Bus: " +busCompanyName + " - " + busId + 
                "        </h4>\n" +
                "      </div>\n" +
                "    </div>\n" +
                "  </body>\n" +
                "</html>";
    }
    
    public static String getRentalDetailsHTML(String pickupLocation, String mileage, String fuelType,
            int seats, String carType, String carCompany, String carModel) {
        
        return "<html>\n" +
                    "  <head>\n" +
                    "    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\" />\n" +
                    "    <link\n" +
                    "      rel=\"stylesheet\"\n" +
                    "      href=\"https://fonts.googleapis.com/css2?family=Material+Symbols+Outlined:opsz,wght,FILL,GRAD@48,400,0,0\"\n" +
                    "    />\n" +
                    "    <style>\n" +
                    "      * {\n" +
                    "        box-sizing: border-box;\n" +
                    "      }\n" +
                    "\n" +
                    "      h2,\n" +
                    "      h3,\n" +
                    "      h4,\n" +
                    "      h5 {\n" +
                    "        margin: 0;\n" +
                    "      }\n" +
                    "\n" +
                    "      .row {\n" +
                    "        width: 321px;\n" +
                    "        height: 100px;\n" +
                    "        background-color: #000;\n" +
                    "        padding-left: 10px;\n" +
                    "        color: #ffffff;\n" +
                    "      }\n" +
                    "\n" +
                    "      .column {\n" +
                    "        float: left;\n" +
                    "        width: 33.33%;\n" +
                    "        padding: 10px;\n" +
                    "        height: 150px;\n" +
                    "      }\n" +
                    "\n" +
                    "      .ft-column {\n" +
                    "        float: left;\n" +
                    "        width: 33.33%;\n" +
                    "        padding: 7px 0;\n" +
                    "        text-align: center;\n" +
                    "        height: 30px;\n" +
                    "      }\n" +
                    "\n" +
                    "      .material-symbols-outlined {\n" +
                    "        font-variation-settings: \"FILL\" 0, \"wght\" 400, \"GRAD\" 0, \"opsz\" 48;\n" +
                    "      }\n" +
                    "\n" +
                    "      .flight-icon {\n" +
                    "        transform: rotate(90deg);\n" +
                    "      }\n" +
                    "\n" +
                    "      .flight-details {\n" +
                    "        margin-top: 10px;\n" +
                    "      }\n" +
                    "\n" +
                    "      .flight-type {\n" +
                    "        margin-top: 15px;\n" +
                    "        display: flex;\n" +
                    "        align-items: center;\n" +
                    "      }\n" +
                    "      .button {\n" +
                    "        display: flex;\n" +
                    "        align-items: center;\n" +
                    "        margin-left: 70px;\n" +
                    "        border: 2px solid black;\n" +
                    "        background-color: white;\n" +
                    "        color: black;\n" +
                    "        padding: 14px 28px;\n" +
                    "        font-size: 16px;\n" +
                    "        font-weight: 800;\n" +
                    "        cursor: pointer;\n" +
                    "        color: #000;\n" +
                    "      }\n" +
                    "\n" +
                    "      .price {\n" +
                    "        margin-top: 30px;\n" +
                    "        display: flex;\n" +
                    "        align-items: center;\n" +
                    "      }\n" +
                    "\n" +
                    "      .dollar {\n" +
                    "        font-size: 20px;\n" +
                    "        margin-right: 5px;\n" +
                    "      }\n" +
                    "    </style>\n" +
                    "  </head>\n" +
                    "  <body>\n" +
                    "    <div class=\"row\">\n" +
                    "      <h2>Car Details</h2>\n" +
                    "      <h4>\n" +
                    "        Pickup:\n" +
                    "        <span>" + pickupLocation + "</span>\n" +
                    "      </h4>\n" +
                    "      <h4>Drop off: <span>" + pickupLocation + "</span></h4>\n" +
                    "      <h4>\n" +
                    "        Car:\n" +
                    "        <span>"+  carCompany + carType + "</span>\n" +
                    "      </h4>\n" +
                    "      <h5>Seats: " + seats + "</h5>\n" +
                    "      <h5>Car Type: " + carType + "</h5>\n" +
                    "      <h5>Fuel: " + fuelType + "</h5>\n" +
                    "    </div>\n" +
                    "  </body>\n" +
                    "</html>";
    }
    
    public static String getRentalPriceHTML(double rentPrice) {
        return "<html>\n" +
                "  <head>\n" +
                "    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\" />\n" +
                "    <link\n" +
                "      rel=\"stylesheet\"\n" +
                "      href=\"https://fonts.googleapis.com/css2?family=Material+Symbols+Outlined:opsz,wght,FILL,GRAD@48,400,0,0\"\n" +
                "    />\n" +
                "    <style>\n" +
                "      * {\n" +
                "        box-sizing: border-box;\n" +
                "      }\n" +
                "\n" +
                "      h2,\n" +
                "      h3,\n" +
                "      h4,\n" +
                "      h5 {\n" +
                "        margin: 0;\n" +
                "      }\n" +
                "\n" +
                "      .row {\n" +
                "        width: 321px;\n" +
                "        height: 100px;\n" +
                "        background-color: #000;\n" +
                "        color: #ffffff;\n" +
                "        padding-left: 10px;\n" +
                "      }\n" +
                "\n" +
                "      .column {\n" +
                "        float: left;\n" +
                "        width: 33.33%;\n" +
                "        padding: 10px;\n" +
                "        height: 150px;\n" +
                "      }\n" +
                "\n" +
                "      .ft-column {\n" +
                "        float: left;\n" +
                "        width: 33.33%;\n" +
                "        padding: 7px 0;\n" +
                "        text-align: center;\n" +
                "        height: 30px;\n" +
                "      }\n" +
                "\n" +
                "      .material-symbols-outlined {\n" +
                "        font-variation-settings: \"FILL\" 0, \"wght\" 400, \"GRAD\" 0, \"opsz\" 48;\n" +
                "      }\n" +
                "\n" +
                "      .flight-icon {\n" +
                "        transform: rotate(90deg);\n" +
                "      }\n" +
                "\n" +
                "      .flight-details {\n" +
                "        margin-top: 10px;\n" +
                "      }\n" +
                "\n" +
                "      .flight-type {\n" +
                "        margin-top: 15px;\n" +
                "        display: flex;\n" +
                "        align-items: center;\n" +
                "      }\n" +
                "      .button {\n" +
                "        display: flex;\n" +
                "        align-items: center;\n" +
                "        margin-left: 70px;\n" +
                "        border: 2px solid black;\n" +
                "        background-color: white;\n" +
                "        color: black;\n" +
                "        padding: 14px 28px;\n" +
                "        font-size: 16px;\n" +
                "        font-weight: 800;\n" +
                "        cursor: pointer;\n" +
                "        color: #000;\n" +
                "      }\n" +
                "\n" +
                "      .price {\n" +
                "        margin-top: 30px;\n" +
                "        display: flex;\n" +
                "        align-items: center;\n" +
                "      }\n" +
                "\n" +
                "      .dollar {\n" +
                "        font-size: 20px;\n" +
                "        margin-right: 5px;\n" +
                "      }\n" +
                "    </style>\n" +
                "  </head>\n" +
                "  <body>\n" +
                "    <div class=\"row\">\n" +
                "      <h2>Economy</h2>\n" +
                "      <div class=\"flight-details price\">\n" +
                "        <h5>Hourly Rate: $ " + rentPrice + "</h5>\n" +
                "        <button class=\"button\"><span class=\"dollar\">$</span> " + rentPrice * 24
                + "</button>\n" +
                "      </div>\n" +
                "    </div>\n" +
                "  </body>\n" +
                "</html>";
    }
    
    public static String getFormattedDate(String departureDate) {
        
        int month = 0;
        String day = "";
        String year = "";
        StringBuilder stb = new StringBuilder(departureDate);
        year = stb.substring(0, 4);
        month = Integer.parseInt(stb.substring(4, 6));
        day = stb.substring(6, 8);
        
        String[] monthNames = {"Jan","Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug",
        "Sep", "Oct", "Nov", "Dec"};
        
        return day + " " + monthNames[--month] + ", " + year;
    }
}
