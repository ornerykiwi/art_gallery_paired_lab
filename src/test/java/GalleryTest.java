import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class GalleryTest {

    Gallery gallery;
    Artist artist1;
    Artwork piece1;
    Artwork piece2;

    @BeforeEach
    public void setUp(){
        artist1 = new Artist("Frida Kahlo");
        gallery = new Gallery("Bonsai Loft", 0);
        piece1 = new Artwork("Unibrow", artist1, 15000);
        piece2 = new Artwork("Mexico", artist1, 100);
    }

    @Test
    public void checkGalleryName(){
        assertThat(gallery.getName()).isEqualTo("Bonsai Loft");
    }

    @Test
    public void checkStockHasBeenAdded() {
        gallery.setArtwork(piece1);
        gallery.setArtwork(piece2);
        assertThat(gallery.getStockSize()).isEqualTo(2);
    }
    @Test
    public void checkIfMoneyAdded() {
        gallery.addMoney(10);
        assertThat(gallery.getMoney()).isEqualTo(10);
    }

    @Test
    public void checkStockTotal() {
        gallery.setArtwork(piece1);
        gallery.setArtwork(piece2);
        assertThat(gallery.stockTake()).isEqualTo(15100);
    }

}
