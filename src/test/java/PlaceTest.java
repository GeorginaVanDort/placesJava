import org.junit.*;
import static org.junit.Assert.*;
import java.util.ArrayList;
import java.util.List;

public class PlaceTest{
  //REMEMBER TO RENAME!!!!!!1!one!
  @Test
  public void place_createsObject() {
    Place place = new Place("placename");
    assertEquals(true, place instanceof Place);
  }

  @Test
  public void getPlaceName_returnsPlaceName_String() {
    Place place = new Place ("placename");
    assertEquals("placename", place.getPlaceName());
  }
}
