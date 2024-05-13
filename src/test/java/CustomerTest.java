import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class CustomerTest {

    Customer customer;
    Artwork artwork;
    Artist artist;
    Gallery gallery;

    @BeforeEach
    public void setUp() {
        artist = new Artist("Bowser");
        customer = new Customer("Mario", 100);
        gallery = new Gallery("Mushroom Kingdom", 0);
        artwork = new Artwork("Peach", artist, 90);
        gallery.setArtwork(artwork);
    }

    @Test
    public void canBuyArtwork() {
        customer.buyArtwork(gallery.checkStock(artwork));
        assertThat(customer.getWallet()).isEqualTo(10);
    }

    @Test
    public void canDepositToTill() {
        customer.buyArtwork(gallery.checkStock(artwork));
        gallery.addMoney(artwork.getPrice());
        assertThat(gallery.getMoney()).isEqualTo(90);
    }

}
