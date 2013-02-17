package net.exacode.example.application.query.querydsl;

import static com.mysema.query.types.PathMetadataFactory.*;

import com.mysema.query.types.path.*;

import com.mysema.query.types.PathMetadata;
import javax.annotation.Generated;
import com.mysema.query.types.Path;


/**
 * QPgUserMapping is a Querydsl query type for QPgUserMapping
 */
@Generated("com.mysema.query.sql.codegen.MetaDataSerializer")
public class QPgUserMapping extends com.mysema.query.sql.RelationalPathBase<QPgUserMapping> {

    private static final long serialVersionUID = -1533823928;

    public static final QPgUserMapping pgUserMapping = new QPgUserMapping("pg_user_mapping");

    public final SimplePath<Object[]> umoptions = createSimple("umoptions", Object[].class);

    public final NumberPath<Long> umserver = createNumber("umserver", Long.class);

    public final NumberPath<Long> umuser = createNumber("umuser", Long.class);

    public QPgUserMapping(String variable) {
        super(QPgUserMapping.class, forVariable(variable), "pg_catalog", "pg_user_mapping");
    }

    @SuppressWarnings("all")
    public QPgUserMapping(Path<? extends QPgUserMapping> path) {
        super((Class)path.getType(), path.getMetadata(), "pg_catalog", "pg_user_mapping");
    }

    public QPgUserMapping(PathMetadata<?> metadata) {
        super(QPgUserMapping.class, metadata, "pg_catalog", "pg_user_mapping");
    }

}

