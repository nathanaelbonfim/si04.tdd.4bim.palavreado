
import org.junit.Test;
import static org.junit.Assert.*;

import br.unipar.si04.tdd.palavreado.application.Palavreado;

class PalavreadoTestCase {
    String text;
    int expectedWordCount;
    int expectedCharacterCount;
    int expectedCharacterCountWithoutSpaces;
    int expectedCountOfWordsWithOneToFiveLetters;
    int expectedCountOfLetterJ;

    public PalavreadoTestCase(String text, int expectedWordCount, int expectedCharacterCount,
            int expectedCharacterCountWithoutSpaces, int expectedCountOfWordsWithOneToFiveLetters,
            int expectedCountOfLetterJ) {
        this.text = text;
        this.expectedWordCount = expectedWordCount;
        this.expectedCharacterCount = expectedCharacterCount;
        this.expectedCharacterCountWithoutSpaces = expectedCharacterCountWithoutSpaces;
        this.expectedCountOfWordsWithOneToFiveLetters = expectedCountOfWordsWithOneToFiveLetters;
        this.expectedCountOfLetterJ = expectedCountOfLetterJ;
    }
}

public class PalavreadoTest {
    Palavreado palavreado = new Palavreado();

    PalavreadoTestCase smallText = new PalavreadoTestCase(
            "Lorem ipsum dolor sit amet",
            5,
            26,
            22,
            5,
            0);

    PalavreadoTestCase bigText = new PalavreadoTestCase(
            "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Duis eget ornare elit. Vestibulum in iaculis odio, ut elementum purus. Phasellus at tortor eget mauris volutpat ullamcorper. Quisque at diam hendrerit, accumsan enim ut, suscipit velit. Orci varius natoque penatibus et magnis dis parturient montes, nascetur ridiculus mus. Nullam convallis nisl sed sem laoreet, non malesuada dui blandit. Sed aliquam ante sit amet semper fermentum. Proin eget mauris vitae leo vestibulum blandit at nec arcu. Mauris vehicula lorem gravida, ultricies tellus non, egestas augue. Mauris a volutpat sapien.  Sed ac luctus metus. Nam lobortis, turpis et placerat convallis, lorem dolor faucibus massa, sit amet viverra est nulla in leo. Vestibulum tempor blandit lacus ac ultrices. Ut at viverra purus, quis consequat ligula. Integer vel nulla quis ipsum tincidunt posuere. Sed ultricies urna eget dui porta dictum. Duis ac sollicitudin purus. Pellentesque bibendum tortor ac tellus elementum eleifend.  Cras augue eros, facilisis quis sapien ut, congue mollis erat. Vestibulum ante ipsum primis in faucibus orci luctus et ultrices posuere cubilia curae; Maecenas porttitor mauris orci, quis eleifend urna viverra quis. Proin elit metus, auctor in sem nec, molestie accumsan ante. Pellentesque habitant morbi tristique senectus et netus et malesuada fames ac turpis egestas. Duis suscipit consequat laoreet. Sed in lorem feugiat, lobortis dolor in, euismod orci.  Cras fringilla, metus quis fringilla venenatis, erat justo pellentesque neque, non feugiat est est at nulla. Morbi lectus eros, imperdiet a semper et, elementum ut felis. Curabitur ut imperdiet urna, nec bibendum enim. Suspendisse potenti. Nunc sem lorem, maximus sit amet sagittis ut, commodo et velit. Suspendisse feugiat ligula non odio luctus, ut condimentum mi volutpat. Nullam dui nisi, euismod nec nisl vitae, tempus posuere arcu.  Etiam non libero ultrices, rutrum mauris ac, scelerisque massa. Maecenas congue, odio vitae bibendum convallis, risus nulla dapibus ante, in aliquam metus tellus id arcu. Proin sit amet quam semper, mollis metus et, ultrices lacus. Sed facilisis iaculis nisl, hendrerit tristique odio aliquet vel. Morbi ut viverra augue. Aenean egestas porta justo at tincidunt. Vestibulum eget mauris sit amet sapien volutpat accumsan. Integer ac tortor id dolor semper tincidunt. Phasellus imperdiet ipsum at lacus tempus, et porta leo iaculis. Praesent eu mi nunc.  Integer et eros metus. Phasellus quis lacinia est. Class aptent taciti sociosqu ad litora torquent per conubia nostra, per inceptos himenaeos. Sed auctor tristique malesuada. Aliquam erat volutpat. Cras eget ex vitae sem viverra mollis at sit amet est. Sed a ipsum pulvinar, commodo nisl et, aliquet leo. Sed id vehicula ex. Quisque in eros enim.  Fusce et lorem sed orci vestibulum gravida sagittis ac turpis. Suspendisse interdum, tortor non volutpat venenatis, sapien lorem porttitor purus, at lacinia felis erat vel nibh. Nullam sit amet convallis tortor. Aliquam erat volutpat. Nulla tincidunt odio urna, non ultricies dolor euismod ut. Nullam venenatis purus quis nulla consequat, vitae viverra nisi sodales. In iaculis turpis vitae turpis molestie, sit amet consectetur arcu eleifend. Fusce at pretium mauris. Nunc eu porta dui. In risus felis, sollicitudin vitae commodo ac, dictum at est.",
            501,
            3339,
            2833,
            275,
            2);

    @Test
    public void testCountWords() {
        palavreado.ingestText(smallText.text);
        assertEquals(smallText.expectedWordCount, palavreado.countWords());

        palavreado.ingestText(bigText.text);
        assertEquals(bigText.expectedWordCount, palavreado.countWords());
    }

    @Test
    public void testMinimumWords() {
        palavreado.ingestText(smallText.text);
        assertFalse(palavreado.countWords() > smallText.expectedWordCount);

        palavreado.ingestText(bigText.text);
        assertTrue(palavreado.countWords() >= bigText.expectedWordCount);
    }

    @Test
    public void testCountCharacters() {
        palavreado.ingestText(smallText.text);
        assertEquals(smallText.expectedCharacterCount, palavreado.countCharacters());
        
        palavreado.ingestText(bigText.text);
        assertEquals(bigText.expectedCharacterCount, palavreado.countCharacters());
    }

    // @Test
    // public void testCountCharactersWithoutSpaces() {
    // // Use a known text for testing
    // assertEquals(expectedCharacterCountWithoutSpaces,
    // palavreado.countCharactersWithoutSpaces());
    // }

    // @Test
    // public void testCountWordsWithOneToFiveLetters() {
    // // Use a known text for testing
    // assertEquals(expectedCountOfWordsWithOneToFiveLetters,
    // palavreado.countWordsWithOneToFiveLetters());
    // }

    // @Test
    // public void testCountLetterJ() {
    // // Use a known text for testing
    // assertEquals(expectedCountOfLetterJ, palavreado.countLetterJ());
    // }
}
