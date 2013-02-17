package net.exacode.example.application.query.querydsl;

import static com.mysema.query.types.PathMetadataFactory.*;

import com.mysema.query.types.path.*;

import com.mysema.query.types.PathMetadata;
import javax.annotation.Generated;
import com.mysema.query.types.Path;


/**
 * QPgAuthMembersRoleMemberIndex is a Querydsl query type for QPgAuthMembersRoleMemberIndex
 */
@Generated("com.mysema.query.sql.codegen.MetaDataSerializer")
public class QPgAuthMembersRoleMemberIndex extends com.mysema.query.sql.RelationalPathBase<QPgAuthMembersRoleMemberIndex> {

    private static final long serialVersionUID = 428103948;

    public static final QPgAuthMembersRoleMemberIndex pgAuthMembersRoleMemberIndex = new QPgAuthMembersRoleMemberIndex("pg_auth_members_role_member_index");

    public final NumberPath<Long> member = createNumber("member", Long.class);

    public final NumberPath<Long> roleid = createNumber("roleid", Long.class);

    public QPgAuthMembersRoleMemberIndex(String variable) {
        super(QPgAuthMembersRoleMemberIndex.class, forVariable(variable), "pg_catalog", "pg_auth_members_role_member_index");
    }

    @SuppressWarnings("all")
    public QPgAuthMembersRoleMemberIndex(Path<? extends QPgAuthMembersRoleMemberIndex> path) {
        super((Class)path.getType(), path.getMetadata(), "pg_catalog", "pg_auth_members_role_member_index");
    }

    public QPgAuthMembersRoleMemberIndex(PathMetadata<?> metadata) {
        super(QPgAuthMembersRoleMemberIndex.class, metadata, "pg_catalog", "pg_auth_members_role_member_index");
    }

}

