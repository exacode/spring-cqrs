package net.exacode.example.application.query.querydsl;

import static com.mysema.query.types.PathMetadataFactory.*;

import com.mysema.query.types.path.*;

import com.mysema.query.types.PathMetadata;
import javax.annotation.Generated;
import com.mysema.query.types.Path;


/**
 * QPgPltemplateNameIndex is a Querydsl query type for QPgPltemplateNameIndex
 */
@Generated("com.mysema.query.sql.codegen.MetaDataSerializer")
public class QPgPltemplateNameIndex extends com.mysema.query.sql.RelationalPathBase<QPgPltemplateNameIndex> {

    private static final long serialVersionUID = 1166780406;

    public static final QPgPltemplateNameIndex pgPltemplateNameIndex = new QPgPltemplateNameIndex("pg_pltemplate_name_index");

    public final SimplePath<Object> tmplname = createSimple("tmplname", Object.class);

    public QPgPltemplateNameIndex(String variable) {
        super(QPgPltemplateNameIndex.class, forVariable(variable), "pg_catalog", "pg_pltemplate_name_index");
    }

    @SuppressWarnings("all")
    public QPgPltemplateNameIndex(Path<? extends QPgPltemplateNameIndex> path) {
        super((Class)path.getType(), path.getMetadata(), "pg_catalog", "pg_pltemplate_name_index");
    }

    public QPgPltemplateNameIndex(PathMetadata<?> metadata) {
        super(QPgPltemplateNameIndex.class, metadata, "pg_catalog", "pg_pltemplate_name_index");
    }

}

