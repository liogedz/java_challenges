public enum Singleton {
    INSTANCE;
    
    private String name;

    public void setName(String name) {
        this.name = name;
    }

    public void getName() {
        System.out.println("Here is my name :" + name);
    }
}

void main() {
    Singleton init = Singleton.INSTANCE;
    Singleton init2 = Singleton.INSTANCE;
    init.setName("Alex");
    init2.getName();
}
