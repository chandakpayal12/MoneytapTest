import io.cucumber.java.en.Given;

public class MyStepdefs {
    @Given("Input values are {int} and {int}")
    public void inputValuesAreAnd(int first, int second) {
            // Write code here that turns the phrase above into concrete actions
//        System.out.println("Values are" +a);
//        System.out.println("Values are" +b);
//        int A = Integer.parseInt("a");
//        int B = Integer.parseInt("b");
            if ((first!=0 && second!=0)) {
                System.out.println("Values are not 0");
            }
        }
}
