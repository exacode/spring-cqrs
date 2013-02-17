package net.exacode.example.application.query.querydsl;

import static com.mysema.query.types.PathMetadataFactory.*;

import com.mysema.query.types.path.*;

import com.mysema.query.types.PathMetadata;
import javax.annotation.Generated;
import com.mysema.query.types.Path;


/**
 * QPgDescriptionOCOIndex is a Querydsl query type for QPgDescriptionOCOIndex
 */
@Generated("com.mysema.query.sql.codegen.MetaDataSerializer")
public class QPgDescriptionOCOIndex extends com.mysema.query.sql.RelationalPathBase<QPgDescriptionOCOIndex> {

    private static final long serialVersionUID = -1700046504;

    public static final QPgDescriptionOCOIndex pgDescriptionOCOIndex = new QPgDescriptionOCOIndex("pg_description_o_c_o_index");

    public final NumberPath<Long> classoid = createNumber("classoid", Long.class);

    public final NumberPath<Long> objoid = createNumber("objoid", Long.class);

    public final NumberPath<Integer> objsubid = createNumber("objsubid", Integer.class);

    public QPgDescriptionOCOIndex(String variable) {
        super(QPgDescriptionOCOIndex.class, forVariable(variable), "pg_catalog", "pg_description_o_c_o_index");
    }

    @SuppressWarnings("all")
    public QPgDescriptionOCOIndex(Path<? extends QPgDescriptionOCOIndex> path) {
        super((Class)path.getType(), path.getMetadata(), "pg_catalog", "pg_description_o_c_o_index");
    }

    public QPgDescriptionOCOIndex(PathMetadata<?> metadata) {
        super(QPgDescriptionOCOIndex.class, metadata, "pg_catalog", "pg_description_o_c_o_index");
    }

}

