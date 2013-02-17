package net.exacode.example.application.query.querydsl;

import static com.mysema.query.types.PathMetadataFactory.*;

import com.mysema.query.types.path.*;

import com.mysema.query.types.PathMetadata;
import javax.annotation.Generated;
import com.mysema.query.types.Path;


/**
 * QPgLanguageNameIndex is a Querydsl query type for QPgLanguageNameIndex
 */
@Generated("com.mysema.query.sql.codegen.MetaDataSerializer")
public class QPgLanguageNameIndex extends com.mysema.query.sql.RelationalPathBase<QPgLanguageNameIndex> {

    private static final long serialVersionUID = -1136066924;

    public static final QPgLanguageNameIndex pgLanguageNameIndex = new QPgLanguageNameIndex("pg_language_name_index");

    public final SimplePath<Object> lanname = createSimple("lanname", Object.class);

    public QPgLanguageNameIndex(String variable) {
        super(QPgLanguageNameIndex.class, forVariable(variable), "pg_catalog", "pg_language_name_index");
    }

    @SuppressWarnings("all")
    public QPgLanguageNameIndex(Path<? extends QPgLanguageNameIndex> path) {
        super((Class)path.getType(), path.getMetadata(), "pg_catalog", "pg_language_name_index");
    }

    public QPgLanguageNameIndex(PathMetadata<?> metadata) {
        super(QPgLanguageNameIndex.class, metadata, "pg_catalog", "pg_language_name_index");
    }

}

