import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class ArtworkTest {

    Artwork artwork;
    Artist artist;

    @BeforeEach
    public void setUp() {
        artist = new Artist("Gaudi");
        artwork = new Artwork("Casa Batllo", artist, 70000000);
    }

    @Test
    public void getTitle() {
        assertThat(artwork.getTitle()).isEqualTo("Casa Batllo");
    }

    @Test
    public void getArtist() {
        Artist testArtist = artwork.getArtist();
        assertThat(testArtist.getName()).isEqualTo("Gaudi");
    }

    @Test
    public void getPrice() {
        assertThat(artwork.getPrice()).isEqualTo(70000000);
    }
}
