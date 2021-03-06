import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public interface IBookMgr {
	public void addBook(Book b);	// 도서 최초 입력 기능
	public List<Book> search();	// 전체 도서 정보 출력 기능
	public void sell(String isbn, int quantity) throws ISBNNotFoundException;	// 도서가 판매되어 재고 수량을 빼는 기능
	public void buy(String isbn, int quantity) throws ISBNNotFoundException;	// 도서가 구매되어 재고 수량을 더하는 기능
	public int getTotalAmount();	// 재고 도서들의 수량 * 금액을 하여 총 재고 금액을 구하는 리턴
	// 클래스 생성시에 호출되어 지며, 파일("book.dat")에 저장된 파일을 읽어서 ArrayList에 저장한다.
	public ArrayList<Book> open() throws IOException;		
	public void close() throws IOException;	// 프로그램 종료시에 호출되어 지며, ArrayList에 있는 도서 정보를 파일로 저장한다.
	
	public boolean addBooks(Book ...b);	// 도서 추가 메소드
}
