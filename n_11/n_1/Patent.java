package n_11.n_1;

public class Patent extends IntangibleAsset {
    String country;

    public Patent(String name, int price, String country) {
        super(name, price);
        this.country = country;
    }

    public String getCountry() {
        return this.country;
    }
}
