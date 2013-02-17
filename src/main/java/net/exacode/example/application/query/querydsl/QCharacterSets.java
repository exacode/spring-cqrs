package net.exacode.example.application.query.querydsl;

import static com.mysema.query.types.PathMetadataFactory.*;

import com.mysema.query.types.path.*;

import com.mysema.query.types.PathMetadata;
import javax.annotation.Generated;
import com.mysema.query.types.Path;


/**
 * QCharacterSets is a Querydsl query type for QCharacterSets
 */
@Generated("com.mysema.query.sql.codegen.MetaDataSerializer")
public class QCharacterSets extends com.mysema.query.sql.RelationalPathBase<QCharacterSets> {

    private static final long serialVersionUID = 1153364822;

    public static final QCharacterSets characterSets = new QCharacterSets("character_sets");

    public final SimplePath<Object> characterRepertoire = createSimple("character_repertoire", Object.class);

    public final SimplePath<Object> characterSetCatalog = createSimple("character_set_catalog", Object.class);

    public final SimplePath<Object> characterSetName = createSimple("character_set_name", Object.class);

    public final SimplePath<Object> characterSetSchema = createSimple("character_set_schema", Object.class);

    public final SimplePath<Object> defaultCollateCatalog = createSimple("default_collate_catalog", Object.class);

    public final SimplePath<Object> defaultCollateName = createSimple("default_collate_name", Object.class);

    public final SimplePath<Object> defaultCollateSchema = createSimple("default_collate_schema", Object.class);

    public final SimplePath<Object> formOfUse = createSimple("form_of_use", Object.class);

    public QCharacterSets(String variable) {
        super(QCharacterSets.class, forVariable(variable), "information_schema", "character_sets");
    }

    @SuppressWarnings("all")
    public QCharacterSets(Path<? extends QCharacterSets> path) {
        super((Class)path.getType(), path.getMetadata(), "information_schema", "character_sets");
    }

    public QCharacterSets(PathMetadata<?> metadata) {
        super(QCharacterSets.class, metadata, "information_schema", "character_sets");
    }

}

