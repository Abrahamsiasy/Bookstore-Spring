// package tacos;
// import static org.mockito.Mockito.when;
// import static org.springframework.security.test.web.servlet.request.SecurityMockMvcRequestPostProcessors.csrf;
// import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
// import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
// import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.header;
// import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.model;
// import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
// import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.view;

// import java.util.Arrays;
// import java.util.List;
// import java.util.Optional;

// import org.junit.Before;
// import org.junit.Test;
// import org.junit.runner.RunWith;
// import org.springframework.beans.factory.annotation.Autowired;
// import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
// import org.springframework.boot.test.mock.mockito.MockBean;
// import org.springframework.http.MediaType;
// import org.springframework.security.test.context.support.WithMockUser;
// import org.springframework.test.context.junit4.SpringRunner;
// import org.springframework.test.web.servlet.MockMvc;

// import tacos.books.Type;
// import tacos.data.booksRepository;
// import tacos.data.OrderRepository;
// import tacos.data.TacoRepository;
// import tacos.data.UserRepository;
// import tacos.web.DesignTacoController;

// @RunWith(SpringRunner.class)
// @WebMvcTest(DesignTacoController.class)
// public class DesignTacoControllerTest {

//   @Autowired
//   private MockMvc mockMvc;
  
//   private List<books> bookss;

//   private Taco design;
  
//   @MockBean
//   private booksRepository booksRepository;

//   @MockBean
//   private TacoRepository designRepository;

//   @MockBean
//   private OrderRepository orderRepository;

//   @MockBean
//   private UserRepository userRepository;

//   @Before
//   public void setup() {
//     books = Arrays.asList(
//       new books("1", "Flour Tortilla", Type.WRAP),


//     );
  

// }
