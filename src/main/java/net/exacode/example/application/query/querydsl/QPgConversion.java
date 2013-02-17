package net.exacode.example.application.query.querydsl;

import static com.mysema.query.types.PathMetadataFactory.*;

import com.mysema.query.types.path.*;

import com.mysema.query.types.PathMetadata;
import javax.annotation.Generated;
import com.mysema.query.types.Path;


/**
 * QPgConversion is a Querydsl query type for QPgConversion
 */
@Generated("com.mysema.query.sql.codegen.MetaDataSerializer")
public class QPgConversion extends com.mysema.query.sql.RelationalPathBase<QPgConversion> {

    private static final long serialVersionUID = -2041397583;

    public static final QPgConversion pgConversion = new QPgConversion("pg_conversion");

    public final BooleanPath condefault = createBoolean("condefault");

    public final NumberPath<Integer> conforencoding = createNumber("conforencoding", Integer.class);

    public final StringPath conname = createString("conname");

    public final NumberPath<Long> connamespace = createNumber("connamespace", Long.class);

    public final NumberPath<Long> conowner = createNumber("conowner", Long.class);

    public final SimplePath<Object> conproc = createSimple("conproc", Object.class);

    public final NumberPath<Integer> contoencoding = createNumber("contoencoding", Integer.class);

    public QPgConversion(String variable) {
        super(QPgConversion.class, forVariable(variable), "pg_catalog", "pg_conversion");
    }

    @SuppressWarnings("all")
    public QPgConversion(Path<? extends QPgConversion> path) {
        super((Class)path.getType(), path.getMetadata(), "pg_catalog", "pg_conversion");
    }

    public QPgConversion(PathMetadata<?> metadata) {
        super(QPgConversion.class, metadata, "pg_catalog", "pg_conversion");
    }

}

