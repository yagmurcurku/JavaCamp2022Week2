public class Product {

    public Product(int id, String name, String description, double price, int stackAmount, String renk){     //yapıcı method
        System.out.println("Yapıcı blok çalıştı");
        this.id=id;
        this.renk=renk;
        this.name=name;
        this.price=price;
        this.description=description;
        this.stockAmount=stackAmount;
    }

    public Product()
    {

    }

    //attribute | field
    private int id;
    public String name;
    private String description;
    private double price;
    private int stockAmount;
    private String renk;
    private String kod;

    //getter
    public int getId()
    {
        return id;
    }

    //setter
   public void setId(int id) //set edilen değer parametre olarak verilmeli "(int)"
   {
       this.id=id;   //.this.id : içerisinde bulunulan class'ın id'si
   }                 //public void kullanılmasının sebebi set etme işlemi yapılması yani bir iş yapılması

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getStockAmount() {
        return stockAmount;
    }

    public void setStockAmount(int stockAmount) {
        this.stockAmount = stockAmount;
    }

    public String getRenk() {
        return renk;
    }

    public void setRenk(String renk) {
        this.renk = renk;
    }

    public String getKod() {
        return this.name.substring(0,1) + id;
    }
    //kod'u kullanıcının yazması engellendi. set kullanılmadan get ile oluşturuldu.


    //public: her yerden erişilebilen
    //private: sadece tanımlandığı blokta geçerli
}
