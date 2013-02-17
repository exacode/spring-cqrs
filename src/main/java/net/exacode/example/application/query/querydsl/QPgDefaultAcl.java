package net.exacode.example.application.query.querydsl;

import static com.mysema.query.types.PathMetadataFactory.*;

import com.mysema.query.types.path.*;

import com.mysema.query.types.PathMetadata;
import javax.annotation.Generated;
import com.mysema.query.types.Path;


/**
 * QPgDefaultAcl is a Querydsl query type for QPgDefaultAcl
 */
@Generated("com.mysema.query.sql.codegen.MetaDataSerializer")
public class QPgDefaultAcl extends com.mysema.query.sql.RelationalPathBase<QPgDefaultAcl> {

    private static final long serialVersionUID = 888959012;

    public static final QPgDefaultAcl pgDefaultAcl = new QPgDefaultAcl("pg_default_acl");

    public final SimplePath<Object[]> defaclacl = createSimple("defaclacl", Object[].class);

    public final NumberPath<Long> defaclnamespace = createNumber("defaclnamespace", Long.class);

    public final StringPath defaclobjtype = createString("defaclobjtype");

    public final NumberPath<Long> defaclrole = createNumber("defaclrole", Long.class);

    public QPgDefaultAcl(String variable) {
        super(QPgDefaultAcl.class, forVariable(variable), "pg_catalog", "pg_default_acl");
    }

    @SuppressWarnings("all")
    public QPgDefaultAcl(Path<? extends QPgDefaultAcl> path) {
        super((Class)path.getType(), path.getMetadata(), "pg_catalog", "pg_default_acl");
    }

    public QPgDefaultAcl(PathMetadata<?> metadata) {
        super(QPgDefaultAcl.class, metadata, "pg_catalog", "pg_default_acl");
    }

}

