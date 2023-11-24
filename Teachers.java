@Entity
@Table(name="Teachers")
public class Teachers {
	@ID
	@GeneratedValue(strategy=GeneratiobType.IDENTITY)
	private Long id;
	private String name;

}