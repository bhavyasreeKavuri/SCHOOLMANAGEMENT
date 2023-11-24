@Service
public class studentservice {
	@Autowired
private StudentRepository studentRepository;
public List<Student> getAllStudents() { 
	return studentRepository.findAll();
}
public Student getStudentById(Long id) {
}

return studentRepository.findById(id).orElse(null);
public Student saveStudent (Student student) {
	return studentRepository.save(student);
}
public void deleteStudent (Long id) { 
	studentRepository.deleteById(id);
}
}


