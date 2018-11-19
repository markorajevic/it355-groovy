interface ReadingListRepository {
	List<Book> findByReader(String reader)
	List<User> findAllUsers()
	void save(Book book)
	void saveUser(User user)
}