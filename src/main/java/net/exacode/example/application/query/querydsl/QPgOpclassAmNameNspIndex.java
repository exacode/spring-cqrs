package net.exacode.example.application.query.querydsl;

import static com.mysema.query.types.PathMetadataFactory.*;

import com.mysema.query.types.path.*;

import com.mysema.query.types.PathMetadata;
import javax.annotation.Generated;
import com.mysema.query.types.Path;


/**
 * QPgOpclassAmNameNspIndex is a Querydsl query type for QPgOpclassAmNameNspIndex
 */
@Generated("com.mysema.query.sql.codegen.MetaDataSerializer")
public class QPgOpclassAmNameNspIndex extends com.mysema.query.sql.RelationalPathBase<QPgOpclassAmNameNspIndex> {

    private static final long serialVersionUID = 1931103706;

    public static final QPgOpclassAmNameNspIndex pgOpclassAmNameNspIndex = new QPgOpclassAmNameNspIndex("pg_opclass_am_name_nsp_index");

    public final NumberPath<Long> opcmethod = createNumber("opcmethod", Long.class);

    public final SimplePath<Object> opcname = createSimple("opcname", Object.class);

    public final NumberPath<Long> opcnamespace = createNumber("opcnamespace", Long.class);

    public QPgOpclassAmNameNspIndex(String variable) {
        super(QPgOpclassAmNameNspIndex.class, forVariable(variable), "pg_catalog", "pg_opclass_am_name_nsp_index");
    }

    @SuppressWarnings("all")
    public QPgOpclassAmNameNspIndex(Path<? extends QPgOpclassAmNameNspIndex> path) {
        super((Class)path.getType(), path.getMetadata(), "pg_catalog", "pg_opclass_am_name_nsp_index");
    }

    public QPgOpclassAmNameNspIndex(PathMetadata<?> metadata) {
        super(QPgOpclassAmNameNspIndex.class, metadata, "pg_catalog", "pg_opclass_am_name_nsp_index");
    }

}

