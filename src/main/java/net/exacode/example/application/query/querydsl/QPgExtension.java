package net.exacode.example.application.query.querydsl;

import static com.mysema.query.types.PathMetadataFactory.*;

import com.mysema.query.types.path.*;

import com.mysema.query.types.PathMetadata;
import javax.annotation.Generated;
import com.mysema.query.types.Path;


/**
 * QPgExtension is a Querydsl query type for QPgExtension
 */
@Generated("com.mysema.query.sql.codegen.MetaDataSerializer")
public class QPgExtension extends com.mysema.query.sql.RelationalPathBase<QPgExtension> {

    private static final long serialVersionUID = -882867388;

    public static final QPgExtension pgExtension = new QPgExtension("pg_extension");

    public final SimplePath<Object[]> extcondition = createSimple("extcondition", Object[].class);

    public final SimplePath<Object[]> extconfig = createSimple("extconfig", Object[].class);

    public final StringPath extname = createString("extname");

    public final NumberPath<Long> extnamespace = createNumber("extnamespace", Long.class);

    public final NumberPath<Long> extowner = createNumber("extowner", Long.class);

    public final BooleanPath extrelocatable = createBoolean("extrelocatable");

    public final StringPath extversion = createString("extversion");

    public QPgExtension(String variable) {
        super(QPgExtension.class, forVariable(variable), "pg_catalog", "pg_extension");
    }

    @SuppressWarnings("all")
    public QPgExtension(Path<? extends QPgExtension> path) {
        super((Class)path.getType(), path.getMetadata(), "pg_catalog", "pg_extension");
    }

    public QPgExtension(PathMetadata<?> metadata) {
        super(QPgExtension.class, metadata, "pg_catalog", "pg_extension");
    }

}

