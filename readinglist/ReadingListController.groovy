@Controller
@RequestMapping("/")
class ReadingListController {

  String reader = "Craig"

  @Autowired
  ReadingListRepository readingListRepository

  @RequestMapping(method=RequestMethod.GET)
  def readersBooks(Model model) {
    List<User> readingList =
        readingListRepository.findAllUsers()

    if (readingList != null) {
      model.addAttribute("users", readingList)
    }
    "readingList"
  }

  @RequestMapping(method=RequestMethod.POST)
  def addToReadingList(Book book) {
    book.setReader(reader)
    readingListRepository.save(book)
    "redirect:/"
  }

}