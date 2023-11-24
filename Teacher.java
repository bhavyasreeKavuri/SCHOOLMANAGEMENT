@RestController
@RequestMapping("/api/teacher") 
public class Teacher {
	@Autowired
	    private teacherService teacherService;
		
	@GetMapping
	public List<teacher> getAllteachers() { 
	 return teacherService.getAllteachers();
	}
	@GetMapping("/{id}")
	public Teacher getteacherById(@PathVariable Long id) { 
		return teacherService.getteachersById(id);
	}
	@PostMapping
	public teacher saveteacher (@RequestBody teacher teacher) {
		return teacherService.saveteacher(teacher);
	}
	@DeleteMapping("/{id}")
	public void deleteteacher (@PathVariable Long id) { 
		teacherService.deleteteacher(id);
	}
	}