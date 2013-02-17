package net.exacode.example.application.query.querydsl;

import static com.mysema.query.types.PathMetadataFactory.*;

import com.mysema.query.types.path.*;

import com.mysema.query.types.PathMetadata;
import javax.annotation.Generated;
import com.mysema.query.types.Path;


/**
 * QPgAttrdef is a Querydsl query type for QPgAttrdef
 */
@Generated("com.mysema.query.sql.codegen.MetaDataSerializer")
public class QPgAttrdef extends com.mysema.query.sql.RelationalPathBase<QPgAttrdef> {

    private static final long serialVersionUID = 1693580473;

    public static final QPgAttrdef pgAttrdef = new QPgAttrdef("pg_attrdef");

    public final SimplePath<Object> adbin = createSimple("adbin", Object.class);

    public final NumberPath<Short> adnum = createNumber("adnum", Short.class);

    public final NumberPath<Long> adrelid = createNumber("adrelid", Long.class);

    public final StringPath adsrc = createString("adsrc");

    public QPgAttrdef(String variable) {
        super(QPgAttrdef.class, forVariable(variable), "pg_catalog", "pg_attrdef");
    }

    @SuppressWarnings("all")
    public QPgAttrdef(Path<? extends QPgAttrdef> path) {
        super((Class)path.getType(), path.getMetadata(), "pg_catalog", "pg_attrdef");
    }

    public QPgAttrdef(PathMetadata<?> metadata) {
        super(QPgAttrdef.class, metadata, "pg_catalog", "pg_attrdef");
    }

}

