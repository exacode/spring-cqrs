package net.exacode.example.application.query.querydsl;

import static com.mysema.query.types.PathMetadataFactory.*;

import com.mysema.query.types.path.*;

import com.mysema.query.types.PathMetadata;
import javax.annotation.Generated;
import com.mysema.query.types.Path;


/**
 * QPgAuthMembers is a Querydsl query type for QPgAuthMembers
 */
@Generated("com.mysema.query.sql.codegen.MetaDataSerializer")
public class QPgAuthMembers extends com.mysema.query.sql.RelationalPathBase<QPgAuthMembers> {

    private static final long serialVersionUID = -1826484202;

    public static final QPgAuthMembers pgAuthMembers = new QPgAuthMembers("pg_auth_members");

    public final BooleanPath adminOption = createBoolean("admin_option");

    public final NumberPath<Long> grantor = createNumber("grantor", Long.class);

    public final NumberPath<Long> member = createNumber("member", Long.class);

    public final NumberPath<Long> roleid = createNumber("roleid", Long.class);

    public QPgAuthMembers(String variable) {
        super(QPgAuthMembers.class, forVariable(variable), "pg_catalog", "pg_auth_members");
    }

    @SuppressWarnings("all")
    public QPgAuthMembers(Path<? extends QPgAuthMembers> path) {
        super((Class)path.getType(), path.getMetadata(), "pg_catalog", "pg_auth_members");
    }

    public QPgAuthMembers(PathMetadata<?> metadata) {
        super(QPgAuthMembers.class, metadata, "pg_catalog", "pg_auth_members");
    }

}

