package lk.himash.mokitoTesting.entity;

import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Document("family_master")
public class Family {

	@Id
	private String _id;
	private String members_count;
	private List<String> members;
	private String rooms;
	private String state;
	
	
}
