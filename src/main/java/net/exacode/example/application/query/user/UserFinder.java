package net.exacode.example.application.query.user;

import java.util.List;

import net.exacode.example.application.query.PageCriteria;
import net.exacode.example.application.query.querydsl.QUsers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.data.jdbc.query.QueryDslJdbcTemplate;
import org.springframework.stereotype.Component;

import com.mysema.query.Tuple;
import com.mysema.query.sql.SQLQuery;
import com.mysema.query.types.MappingProjection;

@Component
public class UserFinder {

	private class UserDtoMapper extends MappingProjection<UserDto> {

		public UserDtoMapper() {
			super(UserDto.class, QUsers.users.userId, QUsers.users.login,
					QUsers.users.email);
		}

		@Override
		protected UserDto map(Tuple tuple) {
			UserDto user = new UserDto();
			user.setId(tuple.get(QUsers.users.userId));
			user.setEmail(tuple.get(QUsers.users.email));
			user.setLogin(tuple.get(QUsers.users.login));
			return user;
		}
	}

	@Autowired
	@Qualifier("queryQueryDslJdbcTemplate")
	private QueryDslJdbcTemplate template;

	public List<UserDto> findByCriteria(UserPageCriteria pageCriteria) {
		if (pageCriteria.getContains() == null
				|| pageCriteria.getContains().length() == 0) {
			return findByCriteria(new PageCriteria(pageCriteria.getOffset(),
					pageCriteria.getLimit()));
		}
		SQLQuery query = template
				.newSqlQuery()
				.from(QUsers.users)
				.where(QUsers.users.email.contains(pageCriteria.getContains())
						.or(QUsers.users.login.contains(pageCriteria
								.getContains())))
				.offset(pageCriteria.getOffset())
				.limit(pageCriteria.getLimit());
		return template.query(query, new UserDtoMapper());
	}

	public List<UserDto> findByCriteria(PageCriteria pageCriteria) {
		SQLQuery query = template.newSqlQuery().from(QUsers.users)
				.offset(pageCriteria.getOffset())
				.limit(pageCriteria.getLimit());
		return template.query(query, new UserDtoMapper());
	}
}
