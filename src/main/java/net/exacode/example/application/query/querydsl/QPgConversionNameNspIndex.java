package net.exacode.example.application.query.querydsl;

import static com.mysema.query.types.PathMetadataFactory.*;

import com.mysema.query.types.path.*;

import com.mysema.query.types.PathMetadata;
import javax.annotation.Generated;
import com.mysema.query.types.Path;


/**
 * QPgConversionNameNspIndex is a Querydsl query type for QPgConversionNameNspIndex
 */
@Generated("com.mysema.query.sql.codegen.MetaDataSerializer")
public class QPgConversionNameNspIndex extends com.mysema.query.sql.RelationalPathBase<QPgConversionNameNspIndex> {

    private static final long serialVersionUID = 891918659;

    public static final QPgConversionNameNspIndex pgConversionNameNspIndex = new QPgConversionNameNspIndex("pg_conversion_name_nsp_index");

    public final SimplePath<Object> conname = createSimple("conname", Object.class);

    public final NumberPath<Long> connamespace = createNumber("connamespace", Long.class);

    public QPgConversionNameNspIndex(String variable) {
        super(QPgConversionNameNspIndex.class, forVariable(variable), "pg_catalog", "pg_conversion_name_nsp_index");
    }

    @SuppressWarnings("all")
    public QPgConversionNameNspIndex(Path<? extends QPgConversionNameNspIndex> path) {
        super((Class)path.getType(), path.getMetadata(), "pg_catalog", "pg_conversion_name_nsp_index");
    }

    public QPgConversionNameNspIndex(PathMetadata<?> metadata) {
        super(QPgConversionNameNspIndex.class, metadata, "pg_catalog", "pg_conversion_name_nsp_index");
    }

}

