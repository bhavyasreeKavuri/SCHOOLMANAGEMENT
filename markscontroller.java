@RestController
@RequestMapping("/api/marks") 
public class markscontroller {
	@Autowired
    private Marks marks;
	
@GetMapping
public List<Marks> getAllmarks() { 
 return Marks.getAllMarks();
}
@GetMapping("/{id}")
public Marks getMarksById(@PathVariable Long id) { 
	return Marks.getMarksById(id);
}
@PostMapping
public Marks saveMarks (@RequestBody Marks marks) {
	return Marks.saveMarks(marks);
}
@DeleteMapping("/{id}")
public void deleteMarks (@PathVariable Long id) { 
	Marks.deleteMarks(id);
}
}

