@Entity
	@Table(name="mark")
	public class mark {
		@ID
		@GeneratedValue(strategy=GeneratiobType.IDENTITY)
		private Long id;
		private String name;

	}

}
