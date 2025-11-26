import java.util.Scanner;
public class salesinvoice {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Bill To Information

        System.out.println("BILL TO INFORMATION:");
        System.out.print("Enter Business Name: ");
        String billBusinessName = sc.nextLine();
        System.out.print("Enter place 1: ");
        String billplace = sc.nextLine();
        System.out.print("Enter street no2: ");
        String billstreet = sc.nextLine();
        System.out.print("Enter GSTIN: ");
        String billGSTIN = sc.nextLine();
        System.out.print("Enter Contact: ");
        String billContact = sc.nextLine();
        System.out.print("Enter Email: ");
        String billEmail = sc.nextLine();

        // Ship To Information

        System.out.println("\nSHIP TO INFORMATION: ");
        System.out.print("Enter Business Name: ");
        String shipBusinessName = sc.nextLine();
        System.out.print("Enter place 1: ");
        String shipplace = sc.nextLine();
        System.out.print("Enter street no 2: ");
        String shipstreet = sc.nextLine();
        System.out.print("Enter GSTIN: ");
        String shipGSTIN = sc.nextLine();
        System.out.print("Enter Contact: ");
        String shipContact = sc.nextLine();
        System.out.print("Enter Email: ");
        String shipEmail = sc.nextLine();

        // Payment Information

        System.out.println("\nPAYMENT INFORMATION: ");

        System.out.print("Enter Payment Date: ");

        String paymentDate = sc.nextLine();

        System.out.print("Enter Payment Terms: ");

        String paymentTerms = sc.nextLine();

        // Product 1

        System.out.println("\nPRODUCT 1: ");

        System.out.print("Enter Product Code: ");
        int p1Code = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter Products' Name: ");
        String p1Name = sc.nextLine();

        System.out.print("Enter it's HSN Code: ");
        String p1HSN = sc.nextLine();

        System.out.print("Enter Quantity: ");
        int p1Qty = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter Units: ");
        String p1Units = sc.nextLine();

        System.out.print("Enter Rate: ");
        double p1Rate = sc.nextDouble();

        System.out.print("Enter Tax (%): ");
        double p1Tax = sc.nextDouble();

        // Product 2

        System.out.println("\n PRODUCT 2:");
        System.out.print("Enter Product Code: ");
        int p2Code = sc.nextInt();
        sc.nextLine();
        System.out.print("Enter Product Name: ");
        String p2Name = sc.nextLine();
        System.out.print("Enter HSN Code: ");
        String p2HSN = sc.nextLine();
        System.out.print("Enter Quantity: ");
        int p2Qty = sc.nextInt();
        sc.nextLine();
        System.out.print("Enter Units: ");
        String p2Units = sc.nextLine();
        System.out.print("Enter Rate: ");
        double p2Rate = sc.nextDouble();
        System.out.print("Enter Tax (%): ");
        double p2Tax = sc.nextDouble();

        // Product 3

        System.out.println("\n PRODUCT 3:");
        System.out.print("Please Enter Product Code: ");
        int p3Code = sc.nextInt();
        sc.nextLine();
        System.out.print("Please Enter Product Name: ");
        String p3Name = sc.nextLine();
        System.out.print("Enter HSN Code: ");
        String p3HSN = sc.nextLine();
        System.out.print("Enter Quantity: ");
        int p3Qty = sc.nextInt();
        sc.nextLine();
        System.out.print("Enter Units: ");
        String p3Units = sc.nextLine();
        System.out.print("Enter Rate: ");
        double p3Rate = sc.nextDouble();
        System.out.print("Enter Tax (%): ");
        double p3Tax = sc.nextDouble();

        // Product 4
        System.out.println("\n PRODUCT 4:");
        System.out.print("Enter Product Code: ");
        int p4Code = sc.nextInt();
        sc.nextLine();
        System.out.print("Enter Product Name: ");
        String p4Name = sc.nextLine();
        System.out.print("Enter HSN Code: ");
        String p4HSN = sc.nextLine();
        System.out.print("Enter Quantity: ");
        int p4Qty = sc.nextInt();
        sc.nextLine();
        System.out.print("Enter Units: ");
        String p4Units = sc.nextLine();
        System.out.print("Enter Rate: ");
        double p4Rate = sc.nextDouble();
        System.out.print("Enter Tax (%): ");
        double p4Tax = sc.nextDouble();

        // Product 5
        System.out.println("\n PRODUCT 5:");
        System.out.print("Enter Product Code: ");
        int p5Code = sc.nextInt();
        sc.nextLine();
        System.out.print("Enter Product Name: ");
        String p5Name = sc.nextLine();
        System.out.print("Enter HSN Code: ");
        String p5HSN = sc.nextLine();
        System.out.print("Enter Quantity: ");
        int p5Qty = sc.nextInt();
        sc.nextLine();
        System.out.print("Enter Units: ");
        String p5Units = sc.nextLine();
        System.out.print("Enter Rate: ");
        double p5Rate = sc.nextDouble();
        System.out.print("Enter Tax (%): ");
        double p5Tax = sc.nextDouble();

        // Product 6
        System.out.println("\n   PRODUCT 6:");
        System.out.print("Enter Product Code: ");
        int p6Code = sc.nextInt();
        sc.nextLine();
        System.out.print("Enter Product Name: ");
        String p6Name = sc.nextLine();
        System.out.print("Enter HSN Code: ");
        String p6HSN = sc.nextLine();
        System.out.print("Enter Quantity: ");
        int p6Qty = sc.nextInt();
        sc.nextLine();
        System.out.print("Enter Units: ");
        String p6Units = sc.nextLine();
        System.out.print("Enter Rate: ");
        double p6Rate = sc.nextDouble();
        System.out.print("Enter Tax (%): ");
        double p6Tax = sc.nextDouble();

        // Product 7
        System.out.println("\n   PRODUCT 7: ");
        System.out.print("Enter Product Code: ");
        int p7Code = sc.nextInt();
        sc.nextLine();
        System.out.print("Enter Product Name: ");
        String p7Name = sc.nextLine();
        System.out.print("Enter HSN Code: ");
        String p7HSN = sc.nextLine();
        System.out.print("Enter Quantity: ");
        int p7Qty = sc.nextInt();
        sc.nextLine();
        System.out.print("Enter Units: ");
        String p7Units = sc.nextLine();
        System.out.print("Enter Rate: ");
        double p7Rate = sc.nextDouble();
        System.out.print("Enter Tax (%): ");
        double p7Tax = sc.nextDouble();

        // Calculations
        double p1Amount = p1Qty * p1Rate * (1 + p1Tax / 100);
        double p2Amount = p2Qty * p2Rate * (1 + p2Tax / 100);
        double p3Amount = p3Qty * p3Rate * (1 + p3Tax / 100);
        double p4Amount = p4Qty * p4Rate * (1 + p4Tax / 100);
        double p5Amount = p5Qty * p5Rate * (1 + p5Tax / 100);
        double p6Amount = p6Qty * p6Rate * (1 + p6Tax / 100);
        double p7Amount = p7Qty * p7Rate * (1 + p7Tax / 100);

        double total = p1Amount + p2Amount + p3Amount + p4Amount + p5Amount + p6Amount + p7Amount;
        double discountPercent = 0.6368;
        double discountAmount = total * discountPercent / 100;
        double grandTotal = total - discountAmount;

        // Display Invoice
        System.out.println("\n\n");
        System.out.println("=======================================================================================================");
        System.out.println("                                    INVOICE                                                                  ");
        System.out.println("=======================================================================================================");
        System.out.println();
        System.out.println("Bill To:                                    Ship To:");
        System.out.println();
        System.out.println(billBusinessName + "                       " + shipBusinessName);
        System.out.println(billplace + "                         "+ shipplace);
        System.out.println(billstreet + "           "+ shipstreet);
        System.out.println("GSTIN:" + billGSTIN +                     "                         GSTIN:" + shipGSTIN);
        System.out.println("Contact: " + billContact +                "                    Contact: " + shipContact);
        System.out.println("Email: " + billEmail +                    "        Email: " + shipEmail);
        System.out.println();
        System.out.println("-------------------------------------------------------------------------------------------------------");
        System.out.println("Payment Date: " + paymentDate + "                Payment Terms: " + paymentTerms);
        System.out.println("-------------------------------------------------------------------------------------------------------");
        System.out.println();
        System.out.printf("%-6s %-13s %-20s %-12s %-10s %-8s %-10s %-8s %-12s%n",
                "S.No", "Product Code", "Product Name", "HSN code", "Quantity", "Units", "Rate", "Tax", "Amount");
        System.out.println("------------------------------------------------------------------------------------------------------");

        System.out.printf("%-6d %-13d %-20s %-12s %-10d %-8s %-10.2f %-8s %-12.2f%n",
                1, p1Code, p1Name, p1HSN, p1Qty, p1Units, p1Rate, p1Tax + "%", p1Amount);

        System.out.printf("%-6d %-13d %-20s %-12s %-10d %-8s %-10.2f %-8s %-12.2f%n",
                2, p2Code, p2Name, p2HSN, p2Qty, p2Units, p2Rate, p2Tax + "%", p2Amount);

        System.out.printf("%-6d %-13d %-20s %-12s %-10d %-8s %-10.2f %-8s %-12.2f%n",
                3, p3Code, p3Name, p3HSN, p3Qty, p3Units, p3Rate, p3Tax + "%", p3Amount);

        System.out.printf("%-6d %-13d %-20s %-12s %-10d %-8s %-10.2f %-8s %-12.2f%n",
                4, p4Code, p4Name, p4HSN, p4Qty, p4Units, p4Rate, p4Tax + "%", p4Amount);

        System.out.printf("%-6d %-13d %-20s %-12s %-10d %-8s %-10.2f %-8s %-12.2f%n",
                5, p5Code, p5Name, p5HSN, p5Qty, p5Units, p5Rate, p5Tax + "%", p5Amount);

        System.out.printf("%-6d %-13d %-20s %-12s %-10d %-8s %-10.2f %-8s %-12.2f%n",
                6, p6Code, p6Name, p6HSN, p6Qty, p6Units, p6Rate, p6Tax + "%", p6Amount);

        System.out.printf("%-6d %-13d %-20s %-12s %-10d %-8s %-10.2f %-8s %-12.2f%n",
                7, p7Code, p7Name, p7HSN, p7Qty, p7Units, p7Rate, p7Tax + "%", p7Amount);

        System.out.println("------------------------------------------------------------------------------------------------------");
        System.out.printf("%73s %12.2f%n", "Total", total);
        System.out.printf("%73s %12.2f%n", "Discounts", discountAmount);
        System.out.printf("%73s %12.2f%n", "Grand total", grandTotal);
        System.out.println("======================================================================================================");

        sc.close();
    }
}