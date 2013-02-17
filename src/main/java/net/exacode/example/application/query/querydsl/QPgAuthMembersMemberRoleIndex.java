package net.exacode.example.application.query.querydsl;

import static com.mysema.query.types.PathMetadataFactory.*;

import com.mysema.query.types.path.*;

import com.mysema.query.types.PathMetadata;
import javax.annotation.Generated;
import com.mysema.query.types.Path;


/**
 * QPgAuthMembersMemberRoleIndex is a Querydsl query type for QPgAuthMembersMemberRoleIndex
 */
@Generated("com.mysema.query.sql.codegen.MetaDataSerializer")
public class QPgAuthMembersMemberRoleIndex extends com.mysema.query.sql.RelationalPathBase<QPgAuthMembersMemberRoleIndex> {

    private static final long serialVersionUID = -1182847604;

    public static final QPgAuthMembersMemberRoleIndex pgAuthMembersMemberRoleIndex = new QPgAuthMembersMemberRoleIndex("pg_auth_members_member_role_index");

    public final NumberPath<Long> member = createNumber("member", Long.class);

    public final NumberPath<Long> roleid = createNumber("roleid", Long.class);

    public QPgAuthMembersMemberRoleIndex(String variable) {
        super(QPgAuthMembersMemberRoleIndex.class, forVariable(variable), "pg_catalog", "pg_auth_members_member_role_index");
    }

    @SuppressWarnings("all")
    public QPgAuthMembersMemberRoleIndex(Path<? extends QPgAuthMembersMemberRoleIndex> path) {
        super((Class)path.getType(), path.getMetadata(), "pg_catalog", "pg_auth_members_member_role_index");
    }

    public QPgAuthMembersMemberRoleIndex(PathMetadata<?> metadata) {
        super(QPgAuthMembersMemberRoleIndex.class, metadata, "pg_catalog", "pg_auth_members_member_role_index");
    }

}

