import java.security.MessageDigest

@Controller
@RequestMapping("/register")
class Register {
  @Autowired
  ReadingListRepository readingListRepository


	@RequestMapping(method=RequestMethod.GET)
  def renderUsers(Model model) {
    // List<Book> readingList =
    //     readingListRepository.findByReader(reader)

    // if (readingList != null) {
    //   model.addAttribute("books", readingList)
    // }
    "register"
  }

@RequestMapping(method=RequestMethod.POST)
  def registerUser(User user) {
	  // user.password = MessageDigest.getInstance("MD5").digest(user.password.bytes).encodeHex().toString()
    readingListRepository.saveUser(user)
    "redirect:/"
  }

}