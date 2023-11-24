@Service
public class TeacherServices {
@Autowired
private TeacherRepository TeacherRepository;
public List<Teacher> getAllTeacher() { 
	return TeacherRepository.findAll();
}
public Teacher getTeacherById(Long id) {
}

return TeacherRepository.findById(id).orElse(null);
public Teacher saveTeacher (Teacher Teacher) {
	return TeacherRepository.save(Teacher);
}
public void deleteTeacher (Long id) { 
	TeacherRepository.deleteById(id);
}
}
