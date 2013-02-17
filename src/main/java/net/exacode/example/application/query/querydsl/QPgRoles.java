package net.exacode.example.application.query.querydsl;

import static com.mysema.query.types.PathMetadataFactory.*;

import com.mysema.query.types.path.*;

import com.mysema.query.types.PathMetadata;
import javax.annotation.Generated;
import com.mysema.query.types.Path;


/**
 * QPgRoles is a Querydsl query type for QPgRoles
 */
@Generated("com.mysema.query.sql.codegen.MetaDataSerializer")
public class QPgRoles extends com.mysema.query.sql.RelationalPathBase<QPgRoles> {

    private static final long serialVersionUID = 21774402;

    public static final QPgRoles pgRoles = new QPgRoles("pg_roles");

    public final NumberPath<Long> oid = createNumber("oid", Long.class);

    public final BooleanPath rolcanlogin = createBoolean("rolcanlogin");

    public final BooleanPath rolcatupdate = createBoolean("rolcatupdate");

    public final SimplePath<Object[]> rolconfig = createSimple("rolconfig", Object[].class);

    public final NumberPath<Integer> rolconnlimit = createNumber("rolconnlimit", Integer.class);

    public final BooleanPath rolcreatedb = createBoolean("rolcreatedb");

    public final BooleanPath rolcreaterole = createBoolean("rolcreaterole");

    public final BooleanPath rolinherit = createBoolean("rolinherit");

    public final StringPath rolname = createString("rolname");

    public final StringPath rolpassword = createString("rolpassword");

    public final BooleanPath rolreplication = createBoolean("rolreplication");

    public final BooleanPath rolsuper = createBoolean("rolsuper");

    public final DateTimePath<java.sql.Timestamp> rolvaliduntil = createDateTime("rolvaliduntil", java.sql.Timestamp.class);

    public QPgRoles(String variable) {
        super(QPgRoles.class, forVariable(variable), "pg_catalog", "pg_roles");
    }

    @SuppressWarnings("all")
    public QPgRoles(Path<? extends QPgRoles> path) {
        super((Class)path.getType(), path.getMetadata(), "pg_catalog", "pg_roles");
    }

    public QPgRoles(PathMetadata<?> metadata) {
        super(QPgRoles.class, metadata, "pg_catalog", "pg_roles");
    }

}

