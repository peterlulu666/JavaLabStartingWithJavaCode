package JavaLabObject;

// I will create my CreditCard file.
// It should have data fields that include an owner of type Person,
// a balance of type Money, and a creditLimit of type Money.
public class CreditCard {
    private Money balance;
    private Money creditLimit;
    private Person owner;

//  It should have a constructor that has two parameter
    public CreditCard(Person owner, Money creditLimit) {
        this.creditLimit = creditLimit;
        this.owner = owner;
//      The balance can be initialized to a Money value of zero
        this.balance = new Money(0);


    }

//  It should have accessor methods to get the balance and the available credit.
//  Since these are objects (pass by reference), we don’t want to create an insecure
//  credit card by passing out addresses to components in our credit card,
//  so we must return a new object with the same values.
    public Money getBalance() {
        return new Money(balance);
    }

    public Money getCreditLimit() {
        return new Money(creditLimit);
    }

//  It should have an accessor method to get the
//  information about the owner, but in the form of a String that can be printed out.
//  This can be done by calling the toString method for the owner.
    public String getPersonals() {
        return owner.toString();
    }

//  It should have a method that will charge to the credit card by adding
//  the amount of Money in the parameter to the balance if it will not exceed the credit limit.
    public void charge(Money amount) {
        if (balance.add(amount).compareTo(creditLimit) < 0) {
            System.out.println("Charge: " + amount);
            balance = balance.add(amount);
        }
        else {
            System.out.println("Exceeds credit limit ");


        }


    }

//  It should have a method that will make
//  a payment on the credit card by subtracting
//  the amount of Money in the parameter from the balance.
    public void payment(Money amount) {
        System.out.println("Payment: " + amount);
        balance = balance.subtract(amount);


    }
}
