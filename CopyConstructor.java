public class CopyConstructor {
    private String mobile;
    // A copy constructor is used to clone objects

    /*
    The constructor receives the objects of the same class as a parameter 
    and instantiates the newly created object with those values.
    */

    public CopyConstructor() {}

    //Creating a copy constructor
    public CopyConstructor(CopyConstructor myObjectToClone) {
        this.mobile = myObjectToClone.mobile;
    }

    // getters
    String getMobile() {
        return mobile;
    }

    // Setters
    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    //main function
    public static void main(String[] args) {
        CopyConstructor object = new CopyConstructor();
        object.setMobile("OnePlus 7T");

        CopyConstructor object1 = new CopyConstructor(object);
        System.out.println(object1.getMobile());
    }

}