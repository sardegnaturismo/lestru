/*******************************************************************************
 *
 *  Copyright 2011 - Sardegna Ricerche, Distretto ICT, Pula, Italy
 *
 * Licensed under the EUPL, Version 1.1.
 * You may not use this work except in compliance with the Licence.
 * You may obtain a copy of the Licence at:
 *
 *  http://www.osor.eu/eupl
 *
 * Unless required by applicable law or agreed to in  writing, software distributed under the Licence is distributed on an "AS IS" basis,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the Licence for the specific language governing permissions and limitations under the Licence.
 * In case of controversy the competent court is the Court of Cagliari (Italy).
 *******************************************************************************/
package service;


import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import persistence.mybatis.mappers.StudenteMapper;

import model.Studente;

@Service
public class StudenteServiceImpl implements StudenteService{
	@Autowired
	StudenteMapper studenteMapper = null;
	
	public List<Studente> findAll() {
		List<Studente> ret = null;
			
		ret = this.getStudenteMapper().findAll();
		return ret;
	}

	
	public StudenteMapper getStudenteMapper() {
		return studenteMapper;
	}



	public void setStudenteMapper(StudenteMapper studenteMapper) {
		this.studenteMapper = studenteMapper;
	}
	
	
}
