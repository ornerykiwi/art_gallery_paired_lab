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
        customer.buyArtwork(gallery.checkStock(artwork), gallery);
        assertThat(customer.getWallet()).isEqualTo(10);
    }

    @Test
    public void canDepositToTill() {
        customer.buyArtwork(gallery.checkStock(artwork), gallery);
        assertThat(gallery.getMoney()).isEqualTo(90);
    }

    @Test
    public void transferToArtCollection(){
        customer.buyArtwork(gallery.checkStock(artwork), gallery);
        assertThat(customer.checkArtCollection(artwork)).isEqualTo(true);
    }

    @Test
    public void removeFromGalleryStock(){
        customer.buyArtwork(gallery.checkStock(artwork), gallery);
        assertThat(gallery.checkStock(artwork)).isEqualTo(null);
    }

}
