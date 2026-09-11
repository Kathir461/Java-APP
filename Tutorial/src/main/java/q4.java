interface Confidential {
}
class Document {
    String title;
    Document(String title) {
        this.title = title;
    }
    void displayDetails() {
        System.out.println("Document: " + title);
    }
}
class PublicDocument extends Document {
    PublicDocument(String title) {
        super(title);
    }
}
class ConfidentialDocument extends Document implements Confidential {
    ConfidentialDocument(String title) {
        super(title);
    }
}
class FinancialDocument extends Document implements Confidential {
    FinancialDocument(String title) {
        super(title);
    }
}
public class q4 {
    public static void main(String[] args) {
        Document d1 = new PublicDocument("College Notice");
        Document d2 = new ConfidentialDocument("Employee Salary Report");
        Document d3 = new FinancialDocument("Company Financial Report");
        checkConfidential(d1);
        checkConfidential(d2);
        checkConfidential(d3);
    }
    static void checkConfidential(Document document) {
        document.displayDetails();
        if (document instanceof Confidential) {
            System.out.println("Status: Confidential");
        } else {
            System.out.println("Status: Public");
        }
        System.out.println();
    }
}