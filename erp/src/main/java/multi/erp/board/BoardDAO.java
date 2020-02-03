package multi.erp.board;

import java.util.List;

public interface BoardDAO {
	List<BoardVO> boardList();
	int insert(BoardVO board);
	List<BoardVO> categorySearch(String category);
	List<BoardVO> searchList(String tag,String search);
	List<BoardVO> pageList();
	BoardVO read(String board_no);
	int update(BoardVO board);
	int delete(String board_no);
}
