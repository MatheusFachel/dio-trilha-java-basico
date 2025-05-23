import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class BoardServiceTest {

    private BoardService boardService;

    @Before
    public void setUp() {
        boardService = new BoardService();
    }

    @Test
    public void testCreateBoard() {
        Board board = boardService.createBoard("Novo Quadro");
        assertNotNull(board);
        assertEquals("Novo Quadro", board.getTitle());
    }
}
