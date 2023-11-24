@RestController
@RequestMapping("/api/students") 
public class StudentController {
	@Autowired
    private StudentService studentService;
	
@GetMapping
public List<Student> getAllStudents() { 
 return studentService.getAllStudents();
}
@GetMapping("/{id}")
public Student getStudentById(@PathVariable Long id) { 
	return studentService.getStudentById(id);
}
@PostMapping
public Student saveStudent (@RequestBody Student student) {
	return studentService.saveStudent(student);
}
@DeleteMapping("/{id}")
public void deleteStudent (@PathVariable Long id) { 
	studentService.deleteStudent(id);
}
}