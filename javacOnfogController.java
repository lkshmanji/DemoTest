@Controller
@RequestMapping("/")
public class CustomerController {
  private final CustomerService customerService;

  @Autowired
  public CustomerController(CustomerService customerService) {
    this.customerService = customerService;
  }

  @GetMapping("/")
  public String showListCustomers(Model model) {
    model.addAttribute("customers", customerService.getAllCustomers());
    return "list-customers";
  }

  @GetMapping("/delete-customer/{customerID}")
  public String deleteCustomer(@PathVariable long customerID) {
    customerService.deleteCustomerById(customerID);
    return "redirect:/";
  }

  @GetMapping("/add-customer")
  public String showAddCustomer(Model model) {
    model.addAttribute("customer", new Customer());
    return "add-customer";
  }

  @PostMapping("/add-customer")
  public String addCustomer(@ModelAttribute("customer") Customer customer) {
    System.out.println(customer);
    customerService.addCustomer(customer);
    return "redirect:/";
  }

  @GetMapping("/update-customer/{customerID}")
  public String showUpdate(@PathVariable long customerID, Model model) {
    model.addAttribute("customer", customerService.findById(customerID));
    return "update-customer";
  }

  @PostMapping("/update-customer")
  public String updateCustomer(@ModelAttribute("customer") Customer customer) {
    System.out.println(customer);
    customerService.updateCustomer(customer);
    return "redirect:/";
  }
}
