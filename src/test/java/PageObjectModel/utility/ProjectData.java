package PageObjectModel.utility;

import java.io.File;
import java.util.Random;

public class ProjectData {
    public String userEmailAddress, firstName, lastName, fullName, companyName, address, state, city, zipCode, phone;

    public String[] randomInfo(){
        Random random = new Random();
        String[] firstNameArr;
        firstNameArr = new String[]{"James", "John", "Robert", "Michael", "William", "David", "Richard", "Charles",
                "Joseph", "Thomas", "Mary", "Patricia", "Linda", "Barbara", "Elizabeth", "Jennifer", "Maria", "Susan",
                "Margaret", "Dorothy"};
        String[] lastNameArr;
        lastNameArr = new String[]{"Smith", "Johnson", "Williams", "Jones", "Brown", "Davis", "Miller", "Wilson", "Moore",
                "Taylor", "Anderson", "Thomas", "Jackson", "White", "Harris"};
        String[] companyNamesArr;
        companyNamesArr = new String[]{
                "ABC Corporation", "XYZ Ltd", "Tech Innovators", "Global Solutions Inc.", "Smart Ventures",
                "Data Systems Ltd", "Innovate Technologies", "Prime Industries", "Elite Innovations", "NexGen Enterprises"
        };
        String[] streetNamesArr;
        streetNamesArr = new String[] {
                "Maple", "Oak", "Cedar", "Pine", "Elm", "Main", "Park", "Sunset", "Broadway", "River"
        };
        String[] streetTypesArr;
        streetTypesArr = new String[] {
                "Street", "Avenue", "Lane", "Boulevard", "Drive", "Court", "Road", "Place", "Circle", "Way"
        };
        String[] indianStatesArr;
        indianStatesArr = new String[] {
                "Andhra Pradesh", "Arunachal Pradesh", "Assam", "Bihar", "Chhattisgarh",
                "Goa", "Gujarat", "Haryana", "Himachal Pradesh", "Jharkhand",
                "Karnataka", "Kerala", "Madhya Pradesh", "Maharashtra", "Manipur",
                "Meghalaya", "Mizoram", "Nagaland", "Odisha", "Punjab",
                "Rajasthan", "Sikkim", "Tamil Nadu", "Telangana", "Tripura",
                "Uttar Pradesh", "Uttarakhand", "West Bengal"
        };

        String[] indianCitiesArr;
        indianCitiesArr = new String[] {
                "Mumbai", "Delhi", "Bangalore", "Kolkata", "Chennai",
                "Hyderabad", "Ahmedabad", "Pune", "Surat", "Jaipur",
                "Lucknow", "Kanpur", "Nagpur", "Indore", "Thane"
        };
        String[] indianZipCodesArr;
        indianZipCodesArr = new String[] {
                "110001", "400001", "560001", "700001", "600001",
                "500001", "380001", "411001", "395001", "302001",
                "226001", "208001", "440001", "452001", "400601"
        };
        String[] randomIndianPhoneNumbersArr;
        randomIndianPhoneNumbersArr = new String[] {
                "+919876543210", "+918765432109", "+917654321098", "+916543210987", "+915432109876",
                "+914321098765", "+913210987654", "+912109876543", "+911098765432", "+919988776655",
                "+918877665544", "+917766554433", "+916655443322", "+915544332211", "+914433221100",
                "+913322110099", "+912211009988", "+911100998877", "+918899007766", "+917789900011"
        };

        firstName = firstNameArr[new Random().nextInt(firstNameArr.length)];
        lastName = lastNameArr[new Random().nextInt(lastNameArr.length)];
        fullName = firstName + " " + lastName;
        userEmailAddress = (firstName).toLowerCase() + "." + (lastName).toLowerCase() + ".automation.practice.test"+random.nextInt(200) + "@yopmail.com";
        companyName = companyNamesArr[new Random().nextInt(companyNamesArr.length)];
        address = streetNamesArr[new Random().nextInt(streetNamesArr.length)] + ", "+ streetTypesArr[new Random().nextInt(streetTypesArr.length)] + ", "+ companyName;
        state = indianStatesArr[new Random().nextInt(indianStatesArr.length)];
        city = indianCitiesArr[new Random().nextInt(indianCitiesArr.length)];
        zipCode = indianZipCodesArr[new Random().nextInt(indianZipCodesArr.length)];
        phone = randomIndianPhoneNumbersArr[new Random().nextInt(randomIndianPhoneNumbersArr.length)];


        return new String[]{fullName, firstName, lastName, userEmailAddress, companyName, address, state, city, zipCode, phone};
    }
}
