package net.exacode.example.application.query.querydsl;

import static com.mysema.query.types.PathMetadataFactory.*;

import com.mysema.query.types.path.*;

import com.mysema.query.types.PathMetadata;
import javax.annotation.Generated;
import com.mysema.query.types.Path;


/**
 * QPgConversionDefaultIndex is a Querydsl query type for QPgConversionDefaultIndex
 */
@Generated("com.mysema.query.sql.codegen.MetaDataSerializer")
public class QPgConversionDefaultIndex extends com.mysema.query.sql.RelationalPathBase<QPgConversionDefaultIndex> {

    private static final long serialVersionUID = -1534217118;

    public static final QPgConversionDefaultIndex pgConversionDefaultIndex = new QPgConversionDefaultIndex("pg_conversion_default_index");

    public final NumberPath<Integer> conforencoding = createNumber("conforencoding", Integer.class);

    public final NumberPath<Long> connamespace = createNumber("connamespace", Long.class);

    public final NumberPath<Integer> contoencoding = createNumber("contoencoding", Integer.class);

    public final NumberPath<Long> oid = createNumber("oid", Long.class);

    public QPgConversionDefaultIndex(String variable) {
        super(QPgConversionDefaultIndex.class, forVariable(variable), "pg_catalog", "pg_conversion_default_index");
    }

    @SuppressWarnings("all")
    public QPgConversionDefaultIndex(Path<? extends QPgConversionDefaultIndex> path) {
        super((Class)path.getType(), path.getMetadata(), "pg_catalog", "pg_conversion_default_index");
    }

    public QPgConversionDefaultIndex(PathMetadata<?> metadata) {
        super(QPgConversionDefaultIndex.class, metadata, "pg_catalog", "pg_conversion_default_index");
    }

}

