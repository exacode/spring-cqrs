package net.exacode.example.application.query.querydsl;

import static com.mysema.query.types.PathMetadataFactory.*;

import com.mysema.query.types.path.*;

import com.mysema.query.types.PathMetadata;
import javax.annotation.Generated;
import com.mysema.query.types.Path;


/**
 * QPgAuthid is a Querydsl query type for QPgAuthid
 */
@Generated("com.mysema.query.sql.codegen.MetaDataSerializer")
public class QPgAuthid extends com.mysema.query.sql.RelationalPathBase<QPgAuthid> {

    private static final long serialVersionUID = 194093022;

    public static final QPgAuthid pgAuthid = new QPgAuthid("pg_authid");

    public final BooleanPath rolcanlogin = createBoolean("rolcanlogin");

    public final BooleanPath rolcatupdate = createBoolean("rolcatupdate");

    public final NumberPath<Integer> rolconnlimit = createNumber("rolconnlimit", Integer.class);

    public final BooleanPath rolcreatedb = createBoolean("rolcreatedb");

    public final BooleanPath rolcreaterole = createBoolean("rolcreaterole");

    public final BooleanPath rolinherit = createBoolean("rolinherit");

    public final StringPath rolname = createString("rolname");

    public final StringPath rolpassword = createString("rolpassword");

    public final BooleanPath rolreplication = createBoolean("rolreplication");

    public final BooleanPath rolsuper = createBoolean("rolsuper");

    public final DateTimePath<java.sql.Timestamp> rolvaliduntil = createDateTime("rolvaliduntil", java.sql.Timestamp.class);

    public QPgAuthid(String variable) {
        super(QPgAuthid.class, forVariable(variable), "pg_catalog", "pg_authid");
    }

    @SuppressWarnings("all")
    public QPgAuthid(Path<? extends QPgAuthid> path) {
        super((Class)path.getType(), path.getMetadata(), "pg_catalog", "pg_authid");
    }

    public QPgAuthid(PathMetadata<?> metadata) {
        super(QPgAuthid.class, metadata, "pg_catalog", "pg_authid");
    }

}

